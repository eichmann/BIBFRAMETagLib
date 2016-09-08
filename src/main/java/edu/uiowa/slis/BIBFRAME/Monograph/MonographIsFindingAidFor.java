package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographIsFindingAidFor extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographIsFindingAidFor currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographIsFindingAidFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographIsFindingAidForIterator theMonographIsFindingAidForIterator = (MonographIsFindingAidForIterator)findAncestorWithClass(this, MonographIsFindingAidForIterator.class);
			pageContext.getOut().print(theMonographIsFindingAidForIterator.getIsFindingAidFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

