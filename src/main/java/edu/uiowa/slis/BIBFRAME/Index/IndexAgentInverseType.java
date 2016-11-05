package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexAgentInverseIterator theIndexAgentInverseIterator = (IndexAgentInverseIterator)findAncestorWithClass(this, IndexAgentInverseIterator.class);
			pageContext.getOut().print(theIndexAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for agent tag ");
		}
		return SKIP_BODY;
	}
}

