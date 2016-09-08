package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceEquivalentToType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceEquivalentToType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceEquivalentToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceEquivalentToIterator theInstanceEquivalentToIterator = (InstanceEquivalentToIterator)findAncestorWithClass(this, InstanceEquivalentToIterator.class);
			pageContext.getOut().print(theInstanceEquivalentToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}

