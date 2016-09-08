package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographAbsorbedByIterator theMonographAbsorbedByIterator = (MonographAbsorbedByIterator)findAncestorWithClass(this, MonographAbsorbedByIterator.class);
			pageContext.getOut().print(theMonographAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

