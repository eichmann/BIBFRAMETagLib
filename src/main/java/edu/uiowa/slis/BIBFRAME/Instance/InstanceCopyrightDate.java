package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceCopyrightDate extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceCopyrightDate currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceCopyrightDate.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceCopyrightDateIterator theInstance = (InstanceCopyrightDateIterator)findAncestorWithClass(this, InstanceCopyrightDateIterator.class);
			pageContext.getOut().print(theInstance.getCopyrightDate());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for copyrightDate tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for copyrightDate tag ");
		}
		return SKIP_BODY;
	}
}

