package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceExtent extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceExtent currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceExtent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceExtentIterator theInstance = (InstanceExtentIterator)findAncestorWithClass(this, InstanceExtentIterator.class);
			pageContext.getOut().print(theInstance.getExtent());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for extent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for extent tag ");
		}
		return SKIP_BODY;
	}
}

