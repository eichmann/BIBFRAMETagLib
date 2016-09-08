package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasAccessPolicyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasAccessPolicyType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasAccessPolicyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasAccessPolicyIterator thePolicySetHasAccessPolicyIterator = (PolicySetHasAccessPolicyIterator)findAncestorWithClass(this, PolicySetHasAccessPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasAccessPolicyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasAccessPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasAccessPolicy tag ");
		}
		return SKIP_BODY;
	}
}

