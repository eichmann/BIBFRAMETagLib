package edu.uiowa.slis.BIBFRAME.PolicySet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PolicySetGovernsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PolicySetGovernsType currentInstance = null;
	private static final Log log = LogFactory.getLog(PolicySetGovernsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PolicySetGovernsIterator thePolicySetGovernsIterator = (PolicySetGovernsIterator)findAncestorWithClass(this, PolicySetGovernsIterator.class);
			pageContext.getOut().print(thePolicySetGovernsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PolicySet for governs tag ", e);
			throw new JspTagException("Error: Can't find enclosing PolicySet for governs tag ");
		}
		return SKIP_BODY;
	}
}

