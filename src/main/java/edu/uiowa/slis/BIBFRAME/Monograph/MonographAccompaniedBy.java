package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographAccompaniedByIterator theMonographAccompaniedByIterator = (MonographAccompaniedByIterator)findAncestorWithClass(this, MonographAccompaniedByIterator.class);
			pageContext.getOut().print(theMonographAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

