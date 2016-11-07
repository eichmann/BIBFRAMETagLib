package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyHasLendingPolicyInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyHasLendingPolicyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyHasLendingPolicyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicyHasLendingPolicyInverseIterator thePolicyHasLendingPolicyInverseIterator = (PolicyHasLendingPolicyInverseIterator)findAncestorWithClass(this, PolicyHasLendingPolicyInverseIterator.class);
			pageContext.getOut().print(thePolicyHasLendingPolicyInverseIterator.getHasLendingPolicyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for hasLendingPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for hasLendingPolicy tag ");
		}
		return SKIP_BODY;
	}
}
