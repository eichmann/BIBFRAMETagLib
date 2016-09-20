package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasSupplementIterator theMonographHasSupplementIterator = (MonographHasSupplementIterator)findAncestorWithClass(this, MonographHasSupplementIterator.class);
			pageContext.getOut().print(theMonographHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

