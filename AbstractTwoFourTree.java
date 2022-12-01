/**
 * Subclasses of this class represent self-balancing 2-3-4 trees satisfying the set property,
 * where every node can store up to three data elements ({@link #v1}, {@link #v2}, {@link #v3})
 * and can have up to four children (subtrees {@link #c1}, {@link #c2}, {@link #c3},{@link #c4}).
 *
 * @param <T> the type of elements maintained by this tree
 * @see <a href="https://en.wikipedia.org/wiki/2%E2%80%933%E2%80%934_tree">2-3-4 tree</a> at Wikipedia
 */
public abstract class AbstractTwoFourTree<T> {
	/**
	 * Possible data elements in the current node.
	 * <p>Note that the variables are filled left to right, i.e.:</p>
	 * <ul>
	 * <li>If this node/tree is empty, then all variables are {@code null}.</li>
	 * <li>If this node contains only one data element, then {@link #v2} and {@link #v3} are null.</li>
	 * <li>If this node contains only two data elements, then only {@link #v3} is null.</li>
	 * </ul>
	 */
	public final T v1, v2, v3;
	/**
	 * Possible children (subtrees) of the current node.
	 * <p>Note that the variables are filled left to right, i.e.:</p>
	 * <ul>
	 * <li>If this node/tree is a leaf, then all variables are {@code null}.</li>
	 * <li>If this node contains only one child, then {@link #c2}, {@link #c3} and {@link #c4} are null.</li>
	 * <li>If this node contains only two children, then only {@link #c3} and {@link #c4} are null.</li>
	 * <li>If this node contains only three children, then only {@link #v3} is null.</li>
	 * </ul>
	 */
	public final AbstractTwoFourTree<T> c1, c2, c3, c4;

	protected AbstractTwoFourTree(AbstractTwoFourTree<T> c1, T v1, AbstractTwoFourTree<T> c2, T v2, AbstractTwoFourTree<T> c3, T v3, AbstractTwoFourTree<T> c4) {
		this.c1 = c1;
		this.v1 = v1;
		this.c2 = c2;
		this.v2 = v2;
		this.c3 = c3;
		this.v3 = v3;
		this.c4 = c4;
	}

	/**
	 * Returns the current number of data elements stored in the entire tree rooted at this node (including all children but no parents).
	 *
	 * @return the current number of data elements in this tree
	 */
	public abstract int size();

	/**
	 * Returns the height of the current node. If this node is a leaf, then this method returns 0.
	 *
	 * @return the height of the current node (0 is this is a leaf)
	 */
	public abstract int height();

	/**
	 * Returns an element {@code e} from this tree such that {@code v.compareTo(e) == 0}, or {@code null} if this tree contains no such element.
	 *
	 * @param v the value to search for in this tree
	 * @return an element {@code e} from this tree such that {@code v.compareTo(e) == 0}, or {@code null} if this tree contains no such element.
	 * @see Comparable#compareTo(Object)
	 */
	public abstract T get(T v);

	/**
	 * Adds the specified element to this tree if it is not already present.
	 * More formally, adds the specified element {@code v} to this tree if this tree contains no element {@code v2} such that {@code v.compareTo(v2) == 0}.
	 * If this tree already contains such an element, the call leaves the tree unchanged and returns this node.
	 *
	 * @param v element to be added to this tree
	 * @return the root of the tree containing the specified element
	 * @see Comparable#compareTo(Object)
	 */
	public abstract AbstractTwoFourTree<T> put(T v);

	/**
	 * Removes the specified element from this tree if it is present.
	 * More formally, removes an element e such that {@code v.compareTo(e) == 0}, if this set contains such an element.
	 * If this tree did not contain such an element, the call leaves the tree unchanged and returns this node.
	 * (This tree will not contain the element once the call returns.)
	 *
	 * @param v object to be removed from this tree, if present
	 * @return the root of the tree not containing the specified element anymore
	 * @see Comparable#compareTo(Object)
	 */
	public abstract AbstractTwoFourTree<T> remove(T v);
}