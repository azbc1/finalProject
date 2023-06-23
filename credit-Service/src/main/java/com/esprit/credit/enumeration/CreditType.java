package com.esprit.credit.enumeration;

public enum CreditType {
    CAR("car"),
    HOME("home"),
    CONSUMPTION("consumption");

	    private final String typeName;

	    CreditType(final String typeName) {
	        this.typeName = typeName;
	    }
	    
	    @Override
	    public String toString() {
	        return typeName;
	    }

}
