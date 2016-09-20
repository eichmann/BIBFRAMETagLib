package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographAccompaniesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographAccompaniesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographAccompaniesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographAccompaniesIterator theMonographAccompaniesIterator = (MonographAccompaniesIterator)findAncestorWithClass(this, MonographAccompaniesIterator.class);
			pageContext.getOut().print(theMonographAccompaniesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for accompanies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for accompanies tag ");
		}
		return SKIP_BODY;
	}
}

