package sizzle.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A {@link SizzleProtoTuple}.
 * 
 * @author rdyer
 * 
 */
public class PersonProtoTuple extends SizzleProtoTuple {
	private final static List<SizzleType> members = new ArrayList<SizzleType>();
	private final static Map<String, Integer> names = new HashMap<String, Integer>();

	static {
		names.put("username", 0);
		members.add(new SizzleString());

		names.put("real_name", 1);
		members.add(new SizzleString());

		names.put("email", 2);
		members.add(new SizzleString());
	}

	/**
	 * Construct a ProjectProtoTuple.
	 */
	public PersonProtoTuple() {
		super(members, names);
	}

	@Override
	public String toJavaType() {
		return "sizzle.types.Shared.Person";
	}
}