package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceEquivalentTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceEquivalentTo currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceEquivalentTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceEquivalentToIterator theInstanceEquivalentToIterator = (InstanceEquivalentToIterator)findAncestorWithClass(this, InstanceEquivalentToIterator.class);
			pageContext.getOut().print(theInstanceEquivalentToIterator.getEquivalentTo());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

