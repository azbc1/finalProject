package com.esprit.credit.enumeration;

public enum CreditStatus {
	 CREATED("created"),
	    PAYED("payed"),
	    CLOSED("closed");

	    private final String typeName;

	    CreditStatus(final String typeName) {
	        this.typeName = typeName;
	    }

	    @Override
	    public String toString() {
	        return typeName;
	    }
}
