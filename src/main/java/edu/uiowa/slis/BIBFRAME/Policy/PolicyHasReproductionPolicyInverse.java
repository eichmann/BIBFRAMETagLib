package edu.uiowa.slis.BIBFRAME.Policy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicyHasReproductionPolicyInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicyHasReproductionPolicyInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicyHasReproductionPolicyInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicyHasReproductionPolicyInverseIterator thePolicyHasReproductionPolicyInverseIterator = (PolicyHasReproductionPolicyInverseIterator)findAncestorWithClass(this, PolicyHasReproductionPolicyInverseIterator.class);
			pageContext.getOut().print(thePolicyHasReproductionPolicyInverseIterator.getHasReproductionPolicyInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Policy for hasReproductionPolicy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Policy for hasReproductionPolicy tag ");
		}
		return SKIP_BODY;
	}
}

