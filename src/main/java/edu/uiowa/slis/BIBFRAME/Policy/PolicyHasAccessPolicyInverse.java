package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyHasAccessPolicyInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyHasAccessPolicyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyHasAccessPolicyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicyHasAccessPolicyInverseIterator thePolicyHasAccessPolicyInverseIterator = (PolicyHasAccessPolicyInverseIterator)findAncestorWithClass(this, PolicyHasAccessPolicyInverseIterator.class);
			pageContext.getOut().print(thePolicyHasAccessPolicyInverseIterator.getHasAccessPolicyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for hasAccessPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for hasAccessPolicy tag ");
		}
		return SKIP_BODY;
	}
}

