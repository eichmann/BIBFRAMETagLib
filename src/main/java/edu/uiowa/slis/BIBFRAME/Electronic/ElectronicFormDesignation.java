package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicFormDesignationIterator theElectronic = (ElectronicFormDesignationIterator)findAncestorWithClass(this, ElectronicFormDesignationIterator.class);
			pageContext.getOut().print(theElectronic.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

