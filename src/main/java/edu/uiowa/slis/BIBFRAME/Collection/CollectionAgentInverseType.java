package edu.uiowa.slis.BIBFRAME.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CollectionAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectionAgentInverseIterator theCollectionAgentInverseIterator = (CollectionAgentInverseIterator)findAncestorWithClass(this, CollectionAgentInverseIterator.class);
			pageContext.getOut().print(theCollectionAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for agent tag ");
		}
		return SKIP_BODY;
	}
}

