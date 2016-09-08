package edu.uiowa.slis.BIBFRAME.DdcClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcClassificationIsClassificationForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcClassificationIsClassificationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcClassificationIsClassificationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DdcClassificationIsClassificationForIterator theDdcClassificationIsClassificationForIterator = (DdcClassificationIsClassificationForIterator)findAncestorWithClass(this, DdcClassificationIsClassificationForIterator.class);
			pageContext.getOut().print(theDdcClassificationIsClassificationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DdcClassification for isClassificationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcClassification for isClassificationFor tag ");
		}
		return SKIP_BODY;
	}
}

