package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographDerivedFromIterator theMonographDerivedFromIterator = (MonographDerivedFromIterator)findAncestorWithClass(this, MonographDerivedFromIterator.class);
			pageContext.getOut().print(theMonographDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

