/**
 * Generated from platform:/resource/biochemsimulation.viatraquery/src/manual/queries/QueryTest.vql
 */
package manual.queries;

import biochemsimulation.reactionrules.reactionRules.AgentInstance;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import manual.queries.TestR2Match;
import manual.queries.util.TestR2QuerySpecification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * Generated pattern matcher API of the manual.queries.testR2 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TestR2Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern testR2(a: AgentInstance, b: AgentInstance) {
 * 	
 * 	AgentInstance.agent.name(a, "A");
 * 	AgentInstance.linkStates(a, aILS);
 * 	AgentInstanceLinkState.site.name(aILS, "x");
 * 	AgentInstanceLinkState.linkState.linkState(aILS, als);
 * 	IndexedLink(als);
 * 	
 * 	AgentInstance.agent.name(b, "B");
 * 	AgentInstance.linkStates(b, bILS);
 * 	AgentInstanceLinkState.site.name(bILS, "x");
 * 	AgentInstanceLinkState.linkState.linkState(bILS, bls);
 * 	IndexedLink(bls);
 * 	
 * 	AgentInstanceLinkState.site(aILS, aSite);
 * 	AgentInstanceLinkState.site(bILS, bSite);
 * 	AgentInstanceLinkState.attachedSite(aILS, bSite);
 * 	AgentInstanceLinkState.attachedSite(bILS, aSite);
 * 
 * 	AgentInstanceLinkState.attachedAgentInstance(aILS, b);
 * 	AgentInstanceLinkState.attachedAgentInstance(bILS, a);
 * 	 
 * 	
 * 	find testR2a(a, "A", "x");
 * 	find testR2a(b, "B", "x");
 * 	find testR2b(a,b);
 * 	
 * }
 * </pre></code>
 * 
 * @see TestR2Match
 *  @see TestR2Processor
 * @see TestR2QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TestR2Matcher extends BaseMatcher<TestR2Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TestR2Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TestR2Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (TestR2Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static TestR2Matcher create() throws ViatraQueryException {
    return new TestR2Matcher();
  }
  
  private final static int POSITION_A = 0;
  
  private final static int POSITION_B = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TestR2Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TestR2Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return matches represented as a TestR2Match object.
   * 
   */
  public Collection<TestR2Match> getAllMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawGetAllMatches(new Object[]{pA, pB});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return a match represented as a TestR2Match object, or null if no match is found.
   * 
   */
  public TestR2Match getOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawGetOneArbitraryMatch(new Object[]{pA, pB});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AgentInstance pA, final AgentInstance pB) {
    return rawHasMatch(new Object[]{pA, pB});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AgentInstance pA, final AgentInstance pB) {
    return rawCountMatches(new Object[]{pA, pB});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super TestR2Match> processor) {
    rawForEachMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AgentInstance pA, final AgentInstance pB, final IMatchProcessor<? super TestR2Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pA, pB}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pA the fixed value of pattern parameter a, or null if not bound.
   * @param pB the fixed value of pattern parameter b, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TestR2Match newMatch(final AgentInstance pA, final AgentInstance pB) {
    return TestR2Match.newMatch(pA, pB);
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfa(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_A, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa() {
    return rawAccumulateAllValuesOfa(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa(final TestR2Match partialMatch) {
    return rawAccumulateAllValuesOfa(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for a.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfa(final AgentInstance pB) {
    return rawAccumulateAllValuesOfa(new Object[]{
    null, 
    pB
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<AgentInstance> rawAccumulateAllValuesOfb(final Object[] parameters) {
    Set<AgentInstance> results = new HashSet<AgentInstance>();
    rawAccumulateAllValues(POSITION_B, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfb() {
    return rawAccumulateAllValuesOfb(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfb(final TestR2Match partialMatch) {
    return rawAccumulateAllValuesOfb(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for b.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<AgentInstance> getAllValuesOfb(final AgentInstance pA) {
    return rawAccumulateAllValuesOfb(new Object[]{
    pA, 
    null
    });
  }
  
  @Override
  protected TestR2Match tupleToMatch(final Tuple t) {
    try {
        return TestR2Match.newMatch((AgentInstance) t.get(POSITION_A), (AgentInstance) t.get(POSITION_B));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR2Match arrayToMatch(final Object[] match) {
    try {
        return TestR2Match.newMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TestR2Match arrayToMatchMutable(final Object[] match) {
    try {
        return TestR2Match.newMutableMatch((AgentInstance) match[POSITION_A], (AgentInstance) match[POSITION_B]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TestR2Matcher> querySpecification() throws ViatraQueryException {
    return TestR2QuerySpecification.instance();
  }
}