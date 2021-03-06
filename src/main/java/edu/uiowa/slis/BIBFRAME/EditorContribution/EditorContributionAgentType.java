package edu.uiowa.slis.BIBFRAME.EditorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorContributionAgentType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EditorContributionAgentType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorContributionAgentType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorContributionAgentIterator theEditorContributionAgentIterator = (EditorContributionAgentIterator)findAncestorWithClass(this, EditorContributionAgentIterator.class);
			pageContext.getOut().print(theEditorContributionAgentIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for agent tag ");
		}
		return SKIP_BODY;
	}
}

