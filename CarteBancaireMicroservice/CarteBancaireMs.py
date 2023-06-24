from flask import Flask, jsonify, request, render_template
from flask_cors import CORS
import psycopg2
import logging
from py_eureka_client import eureka_client

app = Flask(__name__)
CORS(app)

# Database connection parameters
db_params = {
    'host': 'postgres14ms',
    'port': 5432,
    'database': 'cartecredit',
    'user': 'postgres',
    'password': 'Postgres+123'
}

# Connect to the PostgreSQL database
conn = psycopg2.connect(**db_params)
cursor = conn.cursor()

# Create the cards table if it doesn't exist
create_table_query = '''
    CREATE TABLE IF NOT EXISTS cards (
        id SERIAL PRIMARY KEY,
        card_number VARCHAR(16) NOT NULL,
        card_holder VARCHAR(255) NOT NULL,
        expiry_date VARCHAR(10) NOT NULL
    )
'''
cursor.execute(create_table_query)
conn.commit()

# Configure Eureka client
eureka_client.init_registry_client(
    eureka_server="http://eurekaserver:8761/eureka",
    app_name="MyApplicativon",
    instance_port=5000,
    ip_address=eurekaserver,
)

@app.route('/cards', methods=['GET'])
def get_all_cards():
    query = "SELECT * FROM cards"
    cursor.execute(query)
    cards = cursor.fetchall()
    return jsonify(cards)

@app.route('/cards', methods=['POST'])
def add_card():
    card = request.get_json()
    query = "INSERT INTO cards (card_number, card_holder, expiry_date) VALUES (%s, %s, %s)"
    values = (card['card_number'], card['card_holder'], card['expiry_date'])
    cursor.execute(query, values)
    conn.commit()
    return jsonify({'message': 'Card added successfully.'})

@app.route('/cards/<int:card_id>', methods=['GET'])
def get_card(card_id):
    query = "SELECT * FROM cards WHERE id = %s"
    values = (card_id,)
    cursor.execute(query, values)
    card = cursor.fetchone()
    if card:
        return jsonify(card)
    return jsonify({'message': 'Card not found.'}), 404

@app.route('/cards/<int:card_id>', methods=['PUT'])
def update_card(card_id):
    updated_card = request.get_json()
    query = "UPDATE cards SET card_number = %s, card_holder = %s, expiry_date = %s WHERE id = %s"
    values = (updated_card['card_number'], updated_card['card_holder'], updated_card['expiry_date'], card_id)
    cursor.execute(query, values)
    conn.commit()
    if cursor.rowcount > 0:
        return jsonify({'message': 'Card updated successfully.'})
    return jsonify({'message': 'Card not found.'}), 404

@app.route('/cards/<int:card_id>', methods=['DELETE'])
def delete_card(card_id):
    query = "DELETE FROM cards WHERE id = %s"
    values = (card_id,)
    cursor.execute(query, values)
    conn.commit()
    if cursor.rowcount > 0:
        return jsonify({'message': 'Card deleted successfully.'})
    return jsonify({'message': 'Card not found.'}), 404

@app.route('/')
def index():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(host='0.0.0.0')