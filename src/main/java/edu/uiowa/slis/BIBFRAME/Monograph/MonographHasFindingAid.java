package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasFindingAidIterator theMonographHasFindingAidIterator = (MonographHasFindingAidIterator)findAncestorWithClass(this, MonographHasFindingAidIterator.class);
			pageContext.getOut().print(theMonographHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

