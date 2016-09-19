package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceEquivalentToInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceEquivalentToInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceEquivalentToInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceEquivalentToInverseIterator theInstanceEquivalentToInverseIterator = (InstanceEquivalentToInverseIterator)findAncestorWithClass(this, InstanceEquivalentToInverseIterator.class);
			pageContext.getOut().print(theInstanceEquivalentToInverseIterator.getEquivalentToInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

