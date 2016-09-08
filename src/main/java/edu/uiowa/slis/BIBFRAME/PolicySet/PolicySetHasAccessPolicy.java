package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasAccessPolicy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasAccessPolicy currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasAccessPolicy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasAccessPolicyIterator thePolicySetHasAccessPolicyIterator = (PolicySetHasAccessPolicyIterator)findAncestorWithClass(this, PolicySetHasAccessPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasAccessPolicyIterator.getHasAccessPolicy());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasAccessPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasAccessPolicy tag ");
		}
		return SKIP_BODY;
	}
}

