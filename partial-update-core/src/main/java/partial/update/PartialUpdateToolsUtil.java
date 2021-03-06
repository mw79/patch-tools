/*
 * 	Copyright Partial Update library Contributors.
 *
 * 	Partial Update library is licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package partial.update;

/**
 * Class contains some util methods
 */
public class PartialUpdateToolsUtil {

	/**
	 * Method returns Argument Types by array of Arguments
	 * @param objects array of Arguments
	 * @return array of Argument Types
	 */
	public static Class[] getArgumentTypes(Object[] objects) {
		if (objects == null) {
			return null;
		}

		Class[] constructorTypes = new Class[objects.length];
		for (int i = 0; i < constructorTypes.length; i++) {
			constructorTypes[i] = objects[i].getClass();
		}
		return constructorTypes;
	}

}
