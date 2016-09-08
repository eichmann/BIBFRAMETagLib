package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasPartIterator theMonographHasPartIterator = (MonographHasPartIterator)findAncestorWithClass(this, MonographHasPartIterator.class);
			pageContext.getOut().print(theMonographHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

