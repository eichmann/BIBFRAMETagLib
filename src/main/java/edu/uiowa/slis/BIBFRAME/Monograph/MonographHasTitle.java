package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasTitleIterator theMonographHasTitleIterator = (MonographHasTitleIterator)findAncestorWithClass(this, MonographHasTitleIterator.class);
			pageContext.getOut().print(theMonographHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

