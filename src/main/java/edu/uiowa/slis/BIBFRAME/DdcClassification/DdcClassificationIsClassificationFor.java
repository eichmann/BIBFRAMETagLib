package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationIsClassificationFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationIsClassificationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationIsClassificationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationIsClassificationForIterator theDdcClassificationIsClassificationForIterator = (DdcClassificationIsClassificationForIterator)findAncestorWithClass(this, DdcClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theDdcClassificationIsClassificationForIterator.getIsClassificationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

