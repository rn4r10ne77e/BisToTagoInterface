/*************************************************************/
/* Copyright (C) 2019 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Korea Transportation Safety Authority - Site-based, License 17278 17278,
 * at 17, Hyeoksin 6-ro, Gimcheon-si, Gyeongsangbuk-do, South Korea. */
/* Abstract syntax: datex */
/* ASN.1 Java project: datex.Datex */
/* Created: Tue Feb 19 14:47:06 2019 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output datex -ber -root -noSampleCode -messageFormat msvc D:/asn/datex.asn
 */


package com.geon.bis.link.tago.datex.iso14827_2;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Logout from ASN1 Module ISO14827_2.
 * @see Enumerated
 */

public final class Logout extends Enumerated {
    
    /**
     * The default constructor.
     */
    private Logout()
    {
	super(cFirstNumber);
    }
    
    protected Logout(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long other = 0;
	public static final long serverRequested = 1;
	public static final long clientRequested = 2;
	public static final long serverShutdown = 3;
	public static final long clientShutdown = 4;
	public static final long serverCommProblems = 5;
	public static final long clientCommProblems = 6;
	
    }
    // Named list definitions.
    private final static Logout cNamedNumbers[] = {
	new Logout(), 
	new Logout(1), 
	new Logout(2), 
	new Logout(3), 
	new Logout(4), 
	new Logout(5), 
	new Logout(6)
    };
    public static final Logout other = cNamedNumbers[0];
    public static final Logout serverRequested = cNamedNumbers[1];
    public static final Logout clientRequested = cNamedNumbers[2];
    public static final Logout serverShutdown = cNamedNumbers[3];
    public static final Logout clientShutdown = cNamedNumbers[4];
    public static final Logout serverCommProblems = cNamedNumbers[5];
    public static final Logout clientCommProblems = cNamedNumbers[6];
    
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 6)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static Logout valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	if (isUnknownEnumerator())
	    return -1;
	return indexOfValue(mValue);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Enumerated lookupValue(long value)
    {
	return valueOf(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "datex.iso14827_2",
	    "Logout"
	),
	new QName (
	    "ISO14827-2",
	    "Logout"
	),
	800791,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "other",
		    0
		),
		new MemberListElement (
		    "serverRequested",
		    1
		),
		new MemberListElement (
		    "clientRequested",
		    2
		),
		new MemberListElement (
		    "serverShutdown",
		    3
		),
		new MemberListElement (
		    "clientShutdown",
		    4
		),
		new MemberListElement (
		    "serverCommProblems",
		    5
		),
		new MemberListElement (
		    "clientCommProblems",
		    6
		)
	    }
	),
	0,
	other
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Logout object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Logout object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final Logout cUnknownEnumerator = 
	new Logout(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for Logout
