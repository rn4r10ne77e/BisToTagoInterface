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


package datex.businfomation;

import com.oss.asn1.AbstractData;
import com.oss.asn1.GeneralizedTime;
import com.oss.asn1.Sequence;
import com.oss.asn1.SequenceOf;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BusBaseInformation from ASN1 Module BusInfomation.
 * @see Sequence
 */

public class BusBaseInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public BusBaseInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BusBaseInformation(GeneralizedTime tsmg_MessageGenerationTime, 
		    Tsfc_BaseInfoNode tsfc_BaseInfoNode, 
		    Tsfc_BaseInfoLink tsfc_BaseInfoLink, 
		    Tsfc_BaseInfoLinkCoords tsfc_BaseInfoLinkCoords, 
		    Tsfc_BaseInfoStation tsfc_BaseInfoStation, 
		    Tsfc_BaseInfoRoute tsfc_BaseInfoRoute, 
		    Tsfc_BaseInfoRouteplan tsfc_BaseInfoRouteplan, 
		    Tsfc_BaseInfoRoutestation tsfc_BaseInfoRoutestation, 
		    Tsfc_BaseInfoVehicle tsfc_BaseInfoVehicle, 
		    Tsfc_BaseInfoRoutelink tsfc_BaseInfoRoutelink, 
		    Tsfc_BaseInfoRouteallocate tsfc_BaseInfoRouteallocate, 
		    Tsfc_BaseInfoCompany tsfc_BaseInfoCompany, 
		    Tsfc_BaseInfoAdmin tsfc_BaseInfoAdmin)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
	setTsfc_BaseInfoNode(tsfc_BaseInfoNode);
	setTsfc_BaseInfoLink(tsfc_BaseInfoLink);
	setTsfc_BaseInfoLinkCoords(tsfc_BaseInfoLinkCoords);
	setTsfc_BaseInfoStation(tsfc_BaseInfoStation);
	setTsfc_BaseInfoRoute(tsfc_BaseInfoRoute);
	setTsfc_BaseInfoRouteplan(tsfc_BaseInfoRouteplan);
	setTsfc_BaseInfoRoutestation(tsfc_BaseInfoRoutestation);
	setTsfc_BaseInfoVehicle(tsfc_BaseInfoVehicle);
	setTsfc_BaseInfoRoutelink(tsfc_BaseInfoRoutelink);
	setTsfc_BaseInfoRouteallocate(tsfc_BaseInfoRouteallocate);
	setTsfc_BaseInfoCompany(tsfc_BaseInfoCompany);
	setTsfc_BaseInfoAdmin(tsfc_BaseInfoAdmin);
    }
    
    /**
     * Construct with required components.
     */
    public BusBaseInformation(GeneralizedTime tsmg_MessageGenerationTime)
    {
	setTsmg_MessageGenerationTime(tsmg_MessageGenerationTime);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GeneralizedTime();
	mComponents[1] = new Tsfc_BaseInfoNode();
	mComponents[2] = new Tsfc_BaseInfoLink();
	mComponents[3] = new Tsfc_BaseInfoLinkCoords();
	mComponents[4] = new Tsfc_BaseInfoStation();
	mComponents[5] = new Tsfc_BaseInfoRoute();
	mComponents[6] = new Tsfc_BaseInfoRouteplan();
	mComponents[7] = new Tsfc_BaseInfoRoutestation();
	mComponents[8] = new Tsfc_BaseInfoVehicle();
	mComponents[9] = new Tsfc_BaseInfoRoutelink();
	mComponents[10] = new Tsfc_BaseInfoRouteallocate();
	mComponents[11] = new Tsfc_BaseInfoCompany();
	mComponents[12] = new Tsfc_BaseInfoAdmin();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new GeneralizedTime();
	    case 1:
		return new Tsfc_BaseInfoNode();
	    case 2:
		return new Tsfc_BaseInfoLink();
	    case 3:
		return new Tsfc_BaseInfoLinkCoords();
	    case 4:
		return new Tsfc_BaseInfoStation();
	    case 5:
		return new Tsfc_BaseInfoRoute();
	    case 6:
		return new Tsfc_BaseInfoRouteplan();
	    case 7:
		return new Tsfc_BaseInfoRoutestation();
	    case 8:
		return new Tsfc_BaseInfoVehicle();
	    case 9:
		return new Tsfc_BaseInfoRoutelink();
	    case 10:
		return new Tsfc_BaseInfoRouteallocate();
	    case 11:
		return new Tsfc_BaseInfoCompany();
	    case 12:
		return new Tsfc_BaseInfoAdmin();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tsmg_MessageGenerationTime"
    public GeneralizedTime getTsmg_MessageGenerationTime()
    {
	return (GeneralizedTime)mComponents[0];
    }
    
    public void setTsmg_MessageGenerationTime(GeneralizedTime tsmg_MessageGenerationTime)
    {
	mComponents[0] = tsmg_MessageGenerationTime;
    }
    
    
    // Methods for field "tsfc_BaseInfoNode"
    public Tsfc_BaseInfoNode getTsfc_BaseInfoNode()
    {
	return (Tsfc_BaseInfoNode)mComponents[1];
    }
    
    public void setTsfc_BaseInfoNode(Tsfc_BaseInfoNode tsfc_BaseInfoNode)
    {
	mComponents[1] = tsfc_BaseInfoNode;
    }
    
    public boolean hasTsfc_BaseInfoNode()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTsfc_BaseInfoNode()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoNode from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoNode extends SequenceOf<Node> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoNode()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoNode(Node[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Node();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoNode"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Node"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoNode object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoNode object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoNode

    // Methods for field "tsfc_BaseInfoLink"
    public Tsfc_BaseInfoLink getTsfc_BaseInfoLink()
    {
	return (Tsfc_BaseInfoLink)mComponents[2];
    }
    
    public void setTsfc_BaseInfoLink(Tsfc_BaseInfoLink tsfc_BaseInfoLink)
    {
	mComponents[2] = tsfc_BaseInfoLink;
    }
    
    public boolean hasTsfc_BaseInfoLink()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTsfc_BaseInfoLink()
    {
	setComponentAbsent(2);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoLink from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoLink extends SequenceOf<Link> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoLink()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoLink(Link[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Link();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoLink"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Link"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoLink object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoLink object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoLink

    // Methods for field "tsfc_BaseInfoLinkCoords"
    public Tsfc_BaseInfoLinkCoords getTsfc_BaseInfoLinkCoords()
    {
	return (Tsfc_BaseInfoLinkCoords)mComponents[3];
    }
    
    public void setTsfc_BaseInfoLinkCoords(Tsfc_BaseInfoLinkCoords tsfc_BaseInfoLinkCoords)
    {
	mComponents[3] = tsfc_BaseInfoLinkCoords;
    }
    
    public boolean hasTsfc_BaseInfoLinkCoords()
    {
	return componentIsPresent(3);
    }
    
    public void deleteTsfc_BaseInfoLinkCoords()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoLinkCoords from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoLinkCoords extends SequenceOf<Linkcoords> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoLinkCoords()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoLinkCoords(Linkcoords[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Linkcoords();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoLinkCoords"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Linkcoords"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoLinkCoords object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoLinkCoords object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoLinkCoords

    // Methods for field "tsfc_BaseInfoStation"
    public Tsfc_BaseInfoStation getTsfc_BaseInfoStation()
    {
	return (Tsfc_BaseInfoStation)mComponents[4];
    }
    
    public void setTsfc_BaseInfoStation(Tsfc_BaseInfoStation tsfc_BaseInfoStation)
    {
	mComponents[4] = tsfc_BaseInfoStation;
    }
    
    public boolean hasTsfc_BaseInfoStation()
    {
	return componentIsPresent(4);
    }
    
    public void deleteTsfc_BaseInfoStation()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoStation from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoStation extends SequenceOf<Station> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoStation()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoStation(Station[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Station();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoStation"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Station"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoStation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoStation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoStation

    // Methods for field "tsfc_BaseInfoRoute"
    public Tsfc_BaseInfoRoute getTsfc_BaseInfoRoute()
    {
	return (Tsfc_BaseInfoRoute)mComponents[5];
    }
    
    public void setTsfc_BaseInfoRoute(Tsfc_BaseInfoRoute tsfc_BaseInfoRoute)
    {
	mComponents[5] = tsfc_BaseInfoRoute;
    }
    
    public boolean hasTsfc_BaseInfoRoute()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTsfc_BaseInfoRoute()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoRoute from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoRoute extends SequenceOf<Route> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoRoute()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoRoute(Route[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Route();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoRoute"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Route"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoute object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoute object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoRoute

    // Methods for field "tsfc_BaseInfoRouteplan"
    public Tsfc_BaseInfoRouteplan getTsfc_BaseInfoRouteplan()
    {
	return (Tsfc_BaseInfoRouteplan)mComponents[6];
    }
    
    public void setTsfc_BaseInfoRouteplan(Tsfc_BaseInfoRouteplan tsfc_BaseInfoRouteplan)
    {
	mComponents[6] = tsfc_BaseInfoRouteplan;
    }
    
    public boolean hasTsfc_BaseInfoRouteplan()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTsfc_BaseInfoRouteplan()
    {
	setComponentAbsent(6);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoRouteplan from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoRouteplan extends SequenceOf<Routeplan> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoRouteplan()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoRouteplan(Routeplan[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Routeplan();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8006
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoRouteplan"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Routeplan"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRouteplan object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRouteplan object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoRouteplan

    // Methods for field "tsfc_BaseInfoRoutestation"
    public Tsfc_BaseInfoRoutestation getTsfc_BaseInfoRoutestation()
    {
	return (Tsfc_BaseInfoRoutestation)mComponents[7];
    }
    
    public void setTsfc_BaseInfoRoutestation(Tsfc_BaseInfoRoutestation tsfc_BaseInfoRoutestation)
    {
	mComponents[7] = tsfc_BaseInfoRoutestation;
    }
    
    public boolean hasTsfc_BaseInfoRoutestation()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTsfc_BaseInfoRoutestation()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoRoutestation from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoRoutestation extends SequenceOf<Routestation> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoRoutestation()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoRoutestation(Routestation[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Routestation();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoRoutestation"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Routestation"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoutestation object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoutestation object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoRoutestation

    // Methods for field "tsfc_BaseInfoVehicle"
    public Tsfc_BaseInfoVehicle getTsfc_BaseInfoVehicle()
    {
	return (Tsfc_BaseInfoVehicle)mComponents[8];
    }
    
    public void setTsfc_BaseInfoVehicle(Tsfc_BaseInfoVehicle tsfc_BaseInfoVehicle)
    {
	mComponents[8] = tsfc_BaseInfoVehicle;
    }
    
    public boolean hasTsfc_BaseInfoVehicle()
    {
	return componentIsPresent(8);
    }
    
    public void deleteTsfc_BaseInfoVehicle()
    {
	setComponentAbsent(8);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoVehicle from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoVehicle extends SequenceOf<Vehicle> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoVehicle()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoVehicle(Vehicle[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Vehicle();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8008
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoVehicle"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Vehicle"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoVehicle object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoVehicle object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoVehicle

    // Methods for field "tsfc_BaseInfoRoutelink"
    public Tsfc_BaseInfoRoutelink getTsfc_BaseInfoRoutelink()
    {
	return (Tsfc_BaseInfoRoutelink)mComponents[9];
    }
    
    public void setTsfc_BaseInfoRoutelink(Tsfc_BaseInfoRoutelink tsfc_BaseInfoRoutelink)
    {
	mComponents[9] = tsfc_BaseInfoRoutelink;
    }
    
    public boolean hasTsfc_BaseInfoRoutelink()
    {
	return componentIsPresent(9);
    }
    
    public void deleteTsfc_BaseInfoRoutelink()
    {
	setComponentAbsent(9);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoRoutelink from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoRoutelink extends SequenceOf<Routelink> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoRoutelink()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoRoutelink(Routelink[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Routelink();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8009
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoRoutelink"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Routelink"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoutelink object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRoutelink object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoRoutelink

    // Methods for field "tsfc_BaseInfoRouteallocate"
    public Tsfc_BaseInfoRouteallocate getTsfc_BaseInfoRouteallocate()
    {
	return (Tsfc_BaseInfoRouteallocate)mComponents[10];
    }
    
    public void setTsfc_BaseInfoRouteallocate(Tsfc_BaseInfoRouteallocate tsfc_BaseInfoRouteallocate)
    {
	mComponents[10] = tsfc_BaseInfoRouteallocate;
    }
    
    public boolean hasTsfc_BaseInfoRouteallocate()
    {
	return componentIsPresent(10);
    }
    
    public void deleteTsfc_BaseInfoRouteallocate()
    {
	setComponentAbsent(10);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoRouteallocate from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoRouteallocate extends SequenceOf<Routeallocate> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoRouteallocate()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoRouteallocate(Routeallocate[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Routeallocate();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800a
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoRouteallocate"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Routeallocate"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRouteallocate object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoRouteallocate object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoRouteallocate

    // Methods for field "tsfc_BaseInfoCompany"
    public Tsfc_BaseInfoCompany getTsfc_BaseInfoCompany()
    {
	return (Tsfc_BaseInfoCompany)mComponents[11];
    }
    
    public void setTsfc_BaseInfoCompany(Tsfc_BaseInfoCompany tsfc_BaseInfoCompany)
    {
	mComponents[11] = tsfc_BaseInfoCompany;
    }
    
    public boolean hasTsfc_BaseInfoCompany()
    {
	return componentIsPresent(11);
    }
    
    public void deleteTsfc_BaseInfoCompany()
    {
	setComponentAbsent(11);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoCompany from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoCompany extends SequenceOf<Company> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoCompany()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoCompany(Company[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Company();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800b
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoCompany"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Company"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoCompany object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoCompany object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoCompany

    // Methods for field "tsfc_BaseInfoAdmin"
    public Tsfc_BaseInfoAdmin getTsfc_BaseInfoAdmin()
    {
	return (Tsfc_BaseInfoAdmin)mComponents[12];
    }
    
    public void setTsfc_BaseInfoAdmin(Tsfc_BaseInfoAdmin tsfc_BaseInfoAdmin)
    {
	mComponents[12] = tsfc_BaseInfoAdmin;
    }
    
    public boolean hasTsfc_BaseInfoAdmin()
    {
	return componentIsPresent(12);
    }
    
    public void deleteTsfc_BaseInfoAdmin()
    {
	setComponentAbsent(12);
    }
    
    
    
    /**
     * Define the ASN1 Type Tsfc_BaseInfoAdmin from ASN1 Module BusInfomation.
     * @see SequenceOf
     */
    public static class Tsfc_BaseInfoAdmin extends SequenceOf<Admin> {
	
	/**
	 * The default constructor.
	 */
	public Tsfc_BaseInfoAdmin()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Tsfc_BaseInfoAdmin(Admin[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Admin();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800c
		}
	    ),
	    new QName (
		"datex.businfomation",
		"BusBaseInformation$Tsfc_BaseInfoAdmin"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    800787,
	    null,
	    null,
	    new TypeInfoRef (
		new QName (
		    "datex.businfomation",
		    "Admin"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoAdmin object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Tsfc_BaseInfoAdmin object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Tsfc_BaseInfoAdmin

    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "datex.businfomation",
	    "BusBaseInformation"
	),
	new QName (
	    "BusInfomation",
	    "BusBaseInformation"
	),
	800787,
	null,
	new FieldsList (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"GeneralizedTime"
			    ),
			    new QName (
				"builtin",
				"GeneralizedTime"
			    ),
			    800787,
			    null
			)
		    ),
		    "tsmg-MessageGenerationTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoNode"
			)
		    ),
		    "tsfc-BaseInfoNode",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoLink"
			)
		    ),
		    "tsfc-BaseInfoLink",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoLinkCoords"
			)
		    ),
		    "tsfc-BaseInfoLinkCoords",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoStation"
			)
		    ),
		    "tsfc-BaseInfoStation",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoRoute"
			)
		    ),
		    "tsfc-BaseInfoRoute",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoRouteplan"
			)
		    ),
		    "tsfc-BaseInfoRouteplan",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoRoutestation"
			)
		    ),
		    "tsfc-BaseInfoRoutestation",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoVehicle"
			)
		    ),
		    "tsfc-BaseInfoVehicle",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoRoutelink"
			)
		    ),
		    "tsfc-BaseInfoRoutelink",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoRouteallocate"
			)
		    ),
		    "tsfc-BaseInfoRouteallocate",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoCompany"
			)
		    ),
		    "tsfc-BaseInfoCompany",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "datex.businfomation",
			    "BusBaseInformation$Tsfc_BaseInfoAdmin"
			)
		    ),
		    "tsfc-BaseInfoAdmin",
		    12,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BusBaseInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BusBaseInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BusBaseInformation
