package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyHasPolicyInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyHasPolicyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyHasPolicyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicyHasPolicyInverseIterator thePolicyHasPolicyInverseIterator = (PolicyHasPolicyInverseIterator)findAncestorWithClass(this, PolicyHasPolicyInverseIterator.class);
			pageContext.getOut().print(thePolicyHasPolicyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for hasPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for hasPolicy tag ");
		}
		return SKIP_BODY;
	}
}

