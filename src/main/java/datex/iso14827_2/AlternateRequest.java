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


package datex.iso14827_2;

import com.oss.asn1.AbstractData;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type AlternateRequest from ASN1 Module ISO14827_2.
 * @see SubscriptionType
 */

public class AlternateRequest extends SubscriptionType {
    
    /**
     * The default constructor.
     */
    public AlternateRequest()
    {
    }
    
    // Methods for field "subscription"
    public static AlternateRequest createAlternateRequestWithSubscription(SubscriptionData subscription)
    {
	AlternateRequest __object = new AlternateRequest();

	__object.setSubscription(subscription);
	return __object;
    }
    
    public boolean hasSubscription()
    {
	return getChosenFlag() == subscription_chosen;
    }
    
    public SubscriptionData getSubscription()
    {
	if (hasSubscription())
	    return (SubscriptionData)mChosenValue;
	else
	    return null;
    }
    
    public void setSubscription(SubscriptionData subscription)
    {
	setChosenValue(subscription);
	setChosenFlag(subscription_chosen);
    }
    
    
    // Methods for field "datexSubscribe_CancelReason_cd"
    public static AlternateRequest createAlternateRequestWithDatexSubscribe_CancelReason_cd(SubscriptionType.DatexSubscribe_CancelReason_cd datexSubscribe_CancelReason_cd)
    {
	AlternateRequest __object = new AlternateRequest();

	__object.setDatexSubscribe_CancelReason_cd(datexSubscribe_CancelReason_cd);
	return __object;
    }
    
    public boolean hasDatexSubscribe_CancelReason_cd()
    {
	return getChosenFlag() == datexSubscribe_CancelReason_cd_chosen;
    }
    
    public SubscriptionType.DatexSubscribe_CancelReason_cd getDatexSubscribe_CancelReason_cd()
    {
	if (hasDatexSubscribe_CancelReason_cd())
	    return (SubscriptionType.DatexSubscribe_CancelReason_cd)mChosenValue;
	else
	    return null;
    }
    
    public void setDatexSubscribe_CancelReason_cd(SubscriptionType.DatexSubscribe_CancelReason_cd datexSubscribe_CancelReason_cd)
    {
	setChosenValue(datexSubscribe_CancelReason_cd);
	setChosenFlag(datexSubscribe_CancelReason_cd_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case subscription_chosen:
		return new SubscriptionData();
	    case datexSubscribe_CancelReason_cd_chosen:
		return SubscriptionType.DatexSubscribe_CancelReason_cd.other;
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "datex.iso14827_2",
	    "AlternateRequest"
	),
	new QName (
	    "ISO14827-2",
	    "AlternateRequest"
	),
	800787,
	null,
	new FieldsRef (
	    new QName (
		"datex.iso14827_2",
		"SubscriptionType"
	    )
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AlternateRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AlternateRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AlternateRequest
