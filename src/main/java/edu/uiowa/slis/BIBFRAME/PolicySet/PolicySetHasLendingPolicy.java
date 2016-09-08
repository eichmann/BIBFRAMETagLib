package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasLendingPolicy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasLendingPolicy currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasLendingPolicy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasLendingPolicyIterator thePolicySetHasLendingPolicyIterator = (PolicySetHasLendingPolicyIterator)findAncestorWithClass(this, PolicySetHasLendingPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasLendingPolicyIterator.getHasLendingPolicy());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasLendingPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasLendingPolicy tag ");
		}
		return SKIP_BODY;
	}
}

