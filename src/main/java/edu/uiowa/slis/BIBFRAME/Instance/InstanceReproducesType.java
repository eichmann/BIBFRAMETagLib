package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceReproducesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceReproducesIterator theInstanceReproducesIterator = (InstanceReproducesIterator)findAncestorWithClass(this, InstanceReproducesIterator.class);
			pageContext.getOut().print(theInstanceReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

