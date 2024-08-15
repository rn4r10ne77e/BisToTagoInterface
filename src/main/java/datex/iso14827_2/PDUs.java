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
import com.oss.asn1.Choice;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PDUs from ASN1 Module ISO14827_2.
 * @see Choice
 */

public class PDUs extends Choice {
    
    /**
     * The default constructor.
     */
    public PDUs()
    {
    }
    
    public static final  int  datex_initiate_null_chosen = 1;
    public static final  int  login_chosen = 2;
    public static final  int  fred_chosen = 3;
    public static final  int  terminate_chosen = 4;
    public static final  int  logout_chosen = 5;
    public static final  int  subscription_chosen = 6;
    public static final  int  publication_chosen = 7;
    public static final  int  transfer_done_chosen = 8;
    public static final  int  accept_chosen = 9;
    public static final  int  reject_chosen = 10;
    
    // Methods for field "datex_initiate_null"
    public static PDUs createPDUsWithDatex_initiate_null(Initiate datex_initiate_null)
    {
	PDUs __object = new PDUs();

	__object.setDatex_initiate_null(datex_initiate_null);
	return __object;
    }
    
    public boolean hasDatex_initiate_null()
    {
	return getChosenFlag() == datex_initiate_null_chosen;
    }
    
    public Initiate getDatex_initiate_null()
    {
	if (hasDatex_initiate_null())
	    return (Initiate)mChosenValue;
	else
	    return null;
    }
    
    public void setDatex_initiate_null(Initiate datex_initiate_null)
    {
	setChosenValue(datex_initiate_null);
	setChosenFlag(datex_initiate_null_chosen);
    }
    
    
    // Methods for field "login"
    public static PDUs createPDUsWithLogin(Login login)
    {
	PDUs __object = new PDUs();

	__object.setLogin(login);
	return __object;
    }
    
    public boolean hasLogin()
    {
	return getChosenFlag() == login_chosen;
    }
    
    public Login getLogin()
    {
	if (hasLogin())
	    return (Login)mChosenValue;
	else
	    return null;
    }
    
    public void setLogin(Login login)
    {
	setChosenValue(login);
	setChosenFlag(login_chosen);
    }
    
    
    // Methods for field "fred"
    public static PDUs createPDUsWithFred(long fred)
    {
	return createPDUsWithFred(new FrED(fred));
    }
    
    public static PDUs createPDUsWithFred(FrED fred)
    {
	PDUs __object = new PDUs();

	__object.setFred(fred);
	return __object;
    }
    
    public boolean hasFred()
    {
	return getChosenFlag() == fred_chosen;
    }
    
    public FrED getFred()
    {
	if (hasFred())
	    return (FrED)mChosenValue;
	else
	    return null;
    }
    
    public void setFred(long fred)
    {
	setFred(new FrED(fred));
    }
    
    public void setFred(FrED fred)
    {
	setChosenValue(fred);
	setChosenFlag(fred_chosen);
    }
    
    
    // Methods for field "terminate"
    public static PDUs createPDUsWithTerminate(Terminate terminate)
    {
	PDUs __object = new PDUs();

	__object.setTerminate(terminate);
	return __object;
    }
    
    public boolean hasTerminate()
    {
	return getChosenFlag() == terminate_chosen;
    }
    
    public Terminate getTerminate()
    {
	if (hasTerminate())
	    return (Terminate)mChosenValue;
	else
	    return null;
    }
    
    public void setTerminate(Terminate terminate)
    {
	setChosenValue(terminate);
	setChosenFlag(terminate_chosen);
    }
    
    
    // Methods for field "logout"
    public static PDUs createPDUsWithLogout(Logout logout)
    {
	PDUs __object = new PDUs();

	__object.setLogout(logout);
	return __object;
    }
    
    public boolean hasLogout()
    {
	return getChosenFlag() == logout_chosen;
    }
    
    public Logout getLogout()
    {
	if (hasLogout())
	    return (Logout)mChosenValue;
	else
	    return null;
    }
    
    public void setLogout(Logout logout)
    {
	setChosenValue(logout);
	setChosenFlag(logout_chosen);
    }
    
    
    // Methods for field "subscription"
    public static PDUs createPDUsWithSubscription(Subscription subscription)
    {
	PDUs __object = new PDUs();

	__object.setSubscription(subscription);
	return __object;
    }
    
    public boolean hasSubscription()
    {
	return getChosenFlag() == subscription_chosen;
    }
    
    public Subscription getSubscription()
    {
	if (hasSubscription())
	    return (Subscription)mChosenValue;
	else
	    return null;
    }
    
    public void setSubscription(Subscription subscription)
    {
	setChosenValue(subscription);
	setChosenFlag(subscription_chosen);
    }
    
    
    // Methods for field "publication"
    public static PDUs createPDUsWithPublication(Publication publication)
    {
	PDUs __object = new PDUs();

	__object.setPublication(publication);
	return __object;
    }
    
    public boolean hasPublication()
    {
	return getChosenFlag() == publication_chosen;
    }
    
    public Publication getPublication()
    {
	if (hasPublication())
	    return (Publication)mChosenValue;
	else
	    return null;
    }
    
    public void setPublication(Publication publication)
    {
	setChosenValue(publication);
	setChosenFlag(publication_chosen);
    }
    
    
    // Methods for field "transfer_done"
    public static PDUs createPDUsWithTransfer_done(TransferDone transfer_done)
    {
	PDUs __object = new PDUs();

	__object.setTransfer_done(transfer_done);
	return __object;
    }
    
    public boolean hasTransfer_done()
    {
	return getChosenFlag() == transfer_done_chosen;
    }
    
    public TransferDone getTransfer_done(){
	if (hasTransfer_done())
	    return (TransferDone)mChosenValue;
	else
	    return null;
    }
    
    public void setTransfer_done(TransferDone transfer_done)
    {
	setChosenValue(transfer_done);
	setChosenFlag(transfer_done_chosen);
    }
    
    
    // Methods for field "accept"
    public static PDUs createPDUsWithAccept(Accept accept)
    {
	PDUs __object = new PDUs();

	__object.setAccept(accept);
	return __object;
    }
    
    public boolean hasAccept()
    {
	return getChosenFlag() == accept_chosen;
    }
    
    public Accept getAccept()
    {
	if (hasAccept())
	    return (Accept)mChosenValue;
	else
	    return null;
    }
    
    public void setAccept(Accept accept)
    {
	setChosenValue(accept);
	setChosenFlag(accept_chosen);
    }
    
    
    // Methods for field "reject"
    public static PDUs createPDUsWithReject(Reject reject)
    {
	PDUs __object = new PDUs();

	__object.setReject(reject);
	return __object;
    }
    
    public boolean hasReject()
    {
	return getChosenFlag() == reject_chosen;
    }
    
    public Reject getReject()
    {
	if (hasReject())
	    return (Reject)mChosenValue;
	else
	    return null;
    }
    
    public void setReject(Reject reject)
    {
	setChosenValue(reject);
	setChosenFlag(reject_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case datex_initiate_null_chosen:
		return new Initiate();
	    case login_chosen:
		return new Login();
	    case fred_chosen:
		return new FrED();
	    case terminate_chosen:
		return Terminate.other;
	    case logout_chosen:
		return Logout.other;
	    case subscription_chosen:
		return new Subscription();
	    case publication_chosen:
		return new Publication();
	    case transfer_done_chosen:
		return new TransferDone();
	    case accept_chosen:
		return new Accept();
	    case reject_chosen:
		return new Reject();
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
	    "PDUs"
	),
	new QName (
	    "ISO14827-2",
	    "PDUs"
	),
	800787,
	null,
	new FieldsList (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Initiate"
			    ),
			    new QName (
				"ISO14827-2",
				"Initiate"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Initiate"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Initiate"
				)
			    ),
			    0
			)
		    ),
		    "datex-initiate-null",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Login"
			    ),
			    new QName (
				"ISO14827-2",
				"Login"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Login"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Login"
				)
			    ),
			    0
			)
		    ),
		    "login",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"FrED"
			    ),
			    new QName (
				"ISO14827-2",
				"FrED"
			    ),
			    800787,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new FrED(0), 
				    new FrED(4294967295L),
				    0
				)
			    ),
			    null,
			    null
			)
		    ),
		    "fred",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Terminate"
			    ),
			    new QName (
				"ISO14827-2",
				"Terminate"
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
			    Terminate.other
			)
		    ),
		    "terminate",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
			    Logout.other
			)
		    ),
		    "logout",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Subscription"
			    ),
			    new QName (
				"ISO14827-2",
				"Subscription"
			    ),
			    800791,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Subscription"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Subscription"
				)
			    ),
			    0
			)
		    ),
		    "subscription",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Publication"
			    ),
			    new QName (
				"ISO14827-2",
				"Publication"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Publication"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Publication"
				)
			    ),
			    0
			)
		    ),
		    "publication",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"TransferDone"
			    ),
			    new QName (
				"ISO14827-2",
				"TransferDone"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "TransferDone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "TransferDone"
				)
			    ),
			    0
			)
		    ),
		    "transfer-done",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Accept"
			    ),
			    new QName (
				"ISO14827-2",
				"Accept"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Accept"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Accept"
				)
			    ),
			    0
			)
		    ),
		    "accept",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"datex.iso14827_2",
				"Reject"
			    ),
			    new QName (
				"ISO14827-2",
				"Reject"
			    ),
			    800787,
			    null,
			    new FieldsRef (
				new QName (
				    "datex.iso14827_2",
				    "Reject"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "datex.iso14827_2",
				    "Reject"
				)
			    ),
			    0
			)
		    ),
		    "reject",
		    9,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8),
		new TagDecoderElement((short)0x8009, 9)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PDUs object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PDUs object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PDUs
