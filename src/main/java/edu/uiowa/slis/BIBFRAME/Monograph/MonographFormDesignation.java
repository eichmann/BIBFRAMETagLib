package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MonographFormDesignationIterator theMonograph = (MonographFormDesignationIterator)findAncestorWithClass(this, MonographFormDesignationIterator.class);
			pageContext.getOut().print(theMonograph.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

