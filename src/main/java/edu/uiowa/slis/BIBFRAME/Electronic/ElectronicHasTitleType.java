package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasTitleIterator theElectronicHasTitleIterator = (ElectronicHasTitleIterator)findAncestorWithClass(this, ElectronicHasTitleIterator.class);
			pageContext.getOut().print(theElectronicHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

