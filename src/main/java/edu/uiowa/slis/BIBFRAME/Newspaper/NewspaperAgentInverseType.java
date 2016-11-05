package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperAgentInverseIterator theNewspaperAgentInverseIterator = (NewspaperAgentInverseIterator)findAncestorWithClass(this, NewspaperAgentInverseIterator.class);
			pageContext.getOut().print(theNewspaperAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for agent tag ");
		}
		return SKIP_BODY;
	}
}

