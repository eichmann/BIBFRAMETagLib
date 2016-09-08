package edu.uiowa.slis.BIBFRAME.UdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UdcClassificationIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static UdcClassificationIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(UdcClassificationIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UdcClassificationIsClassificationForIterator theUdcClassificationIsClassificationForIterator = (UdcClassificationIsClassificationForIterator)findAncestorWithClass(this, UdcClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theUdcClassificationIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing UdcClassification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing UdcClassification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

