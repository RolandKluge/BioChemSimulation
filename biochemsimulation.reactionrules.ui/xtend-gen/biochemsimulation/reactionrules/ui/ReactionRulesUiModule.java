/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.ui;

import biochemsimulation.reactionrules.ui.AbstractReactionRulesUiModule;
import biochemsimulation.reactionrules.ui.ReactionRulesAntlrTokenToAttributeIdMapper;
import biochemsimulation.reactionrules.ui.ReactionRulesHighlightingConfiguration;
import biochemsimulation.reactionrules.ui.ReactionRulesSemanticHighlightingCalculator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ReactionRulesUiModule extends AbstractReactionRulesUiModule {
  public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
    return ReactionRulesAntlrTokenToAttributeIdMapper.class;
  }
  
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return ReactionRulesHighlightingConfiguration.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return ReactionRulesSemanticHighlightingCalculator.class;
  }
  
  public ReactionRulesUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}