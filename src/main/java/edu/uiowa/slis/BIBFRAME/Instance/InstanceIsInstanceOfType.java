package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceIsInstanceOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceIsInstanceOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceIsInstanceOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceIsInstanceOfIterator theInstanceIsInstanceOfIterator = (InstanceIsInstanceOfIterator)findAncestorWithClass(this, InstanceIsInstanceOfIterator.class);
			pageContext.getOut().print(theInstanceIsInstanceOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for isInstanceOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for isInstanceOf tag ");
		}
		return SKIP_BODY;
	}
}

