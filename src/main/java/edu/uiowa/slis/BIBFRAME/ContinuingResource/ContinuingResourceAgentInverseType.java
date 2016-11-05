package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceAgentInverseIterator theContinuingResourceAgentInverseIterator = (ContinuingResourceAgentInverseIterator)findAncestorWithClass(this, ContinuingResourceAgentInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for agent tag ");
		}
		return SKIP_BODY;
	}
}

