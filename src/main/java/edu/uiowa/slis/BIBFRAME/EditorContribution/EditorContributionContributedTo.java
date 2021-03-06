package edu.uiowa.slis.BIBFRAME.EditorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorContributionContributedTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EditorContributionContributedTo currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorContributionContributedTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorContributionContributedToIterator theEditorContributionContributedToIterator = (EditorContributionContributedToIterator)findAncestorWithClass(this, EditorContributionContributedToIterator.class);
			pageContext.getOut().print(theEditorContributionContributedToIterator.getContributedTo());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for contributedTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for contributedTo tag ");
		}
		return SKIP_BODY;
	}
}

