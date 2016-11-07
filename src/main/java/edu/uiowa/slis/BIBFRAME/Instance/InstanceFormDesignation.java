package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InstanceFormDesignationIterator theInstance = (InstanceFormDesignationIterator)findAncestorWithClass(this, InstanceFormDesignationIterator.class);
			pageContext.getOut().print(theInstance.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}
