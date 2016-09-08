package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIdentifiedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIdentifiedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIdentifiedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIdentifiedByIterator theMonographIdentifiedByIterator = (MonographIdentifiedByIterator)findAncestorWithClass(this, MonographIdentifiedByIterator.class);
			pageContext.getOut().print(theMonographIdentifiedByIterator.getIdentifiedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

