package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasLendingPolicyType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasLendingPolicyType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasLendingPolicyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasLendingPolicyIterator thePolicySetHasLendingPolicyIterator = (PolicySetHasLendingPolicyIterator)findAncestorWithClass(this, PolicySetHasLendingPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasLendingPolicyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasLendingPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasLendingPolicy tag ");
		}
		return SKIP_BODY;
	}
}

