package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasReproductionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasReproductionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasReproductionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasReproductionIterator theElectronicHasReproductionIterator = (ElectronicHasReproductionIterator)findAncestorWithClass(this, ElectronicHasReproductionIterator.class);
			pageContext.getOut().print(theElectronicHasReproductionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasReproduction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasReproduction tag ");
		}
		return SKIP_BODY;
	}
}

