package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexAgentInverseIterator theIndexAgentInverseIterator = (IndexAgentInverseIterator)findAncestorWithClass(this, IndexAgentInverseIterator.class);
			pageContext.getOut().print(theIndexAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for agent tag ");
		}
		return SKIP_BODY;
	}
}

