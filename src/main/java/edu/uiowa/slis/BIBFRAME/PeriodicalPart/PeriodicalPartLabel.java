package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			if (!thePeriodicalPart.commitNeeded) {
				pageContext.getOut().print(thePeriodicalPart.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			return thePeriodicalPart.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PeriodicalPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			thePeriodicalPart.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for label tag ");
		}
	}
}

