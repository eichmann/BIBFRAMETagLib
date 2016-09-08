package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetHasReproductionPolicy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetHasReproductionPolicy currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetHasReproductionPolicy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetHasReproductionPolicyIterator thePolicySetHasReproductionPolicyIterator = (PolicySetHasReproductionPolicyIterator)findAncestorWithClass(this, PolicySetHasReproductionPolicyIterator.class);
			pageContext.getOut().print(thePolicySetHasReproductionPolicyIterator.getHasReproductionPolicy());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for hasReproductionPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for hasReproductionPolicy tag ");
		}
		return SKIP_BODY;
	}
}

