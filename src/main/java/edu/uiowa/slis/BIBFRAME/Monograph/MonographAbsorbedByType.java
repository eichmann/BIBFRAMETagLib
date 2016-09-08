package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographAbsorbedByIterator theMonographAbsorbedByIterator = (MonographAbsorbedByIterator)findAncestorWithClass(this, MonographAbsorbedByIterator.class);
			pageContext.getOut().print(theMonographAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

